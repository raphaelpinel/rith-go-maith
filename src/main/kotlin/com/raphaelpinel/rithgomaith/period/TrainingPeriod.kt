package com.raphaelpinel.rithgomaith.period

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "training_period")
class TrainingPeriod (
    var name: String,
    var startDate: LocalDate,
    var endDate: LocalDate,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
)