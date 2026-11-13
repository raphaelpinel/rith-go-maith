CREATE TABLE training_period
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name      VARCHAR(100) NOT NULL,
    start_date DATE NOT NULL,
    end_date   DATE NOT NULL,
    CONSTRAINT training_period_dates_chk CHECK ( end_date >= start_date )
);