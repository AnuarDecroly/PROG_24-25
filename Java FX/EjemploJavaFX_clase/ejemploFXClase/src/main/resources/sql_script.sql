CREATE TABLE `dawpeople`.`person` (
                                      `dni` VARCHAR(10) NOT NULL,
                                      `name` VARCHAR(45) NOT NULL,
                                      `surname` VARCHAR(75) NOT NULL,
                                      `email` VARCHAR(75) NOT NULL,
                                      `age` INT UNSIGNED NOT NULL,
                                      `phone` VARCHAR(45) NOT NULL,
                                      PRIMARY KEY (`dni`),
                                      UNIQUE INDEX `dni_UNIQUE` (`dni` ASC) VISIBLE,
                                      UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);