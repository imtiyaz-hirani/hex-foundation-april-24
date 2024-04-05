-- MySQL Workbench Forward Engineering
 
-- -----------------------------------------------------
-- Schema hex_april_collegedb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema hex_april_collegedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hex_april_collegedb` DEFAULT CHARACTER SET utf8 ;
USE `hex_april_collegedb` ;

-- -----------------------------------------------------
-- Table `hex_april_collegedb`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hex_april_collegedb`.`address` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(255) NOT NULL,
  `state` VARCHAR(255) NULL,
  `country` VARCHAR(255) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hex_april_collegedb`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hex_april_collegedb`.`student` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `address_id` INT NOT NULL,
  PRIMARY KEY (`id`, `address_id`),
  INDEX `fk_student_address_idx` (`address_id` ASC)  ,
  CONSTRAINT `fk_student_address`
    FOREIGN KEY (`address_id`)
    REFERENCES `hex_april_collegedb`.`address` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hex_april_collegedb`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hex_april_collegedb`.`department` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hex_april_collegedb`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hex_april_collegedb`.`course` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `credits` INT NULL,
  `fee` DOUBLE NULL DEFAULT 0,
  `department_id` INT NOT NULL,
  PRIMARY KEY (`id`, `department_id`),
  INDEX `fk_course_department1_idx` (`department_id` ASC)  ,
  CONSTRAINT `fk_course_department1`
    FOREIGN KEY (`department_id`)
    REFERENCES `hex_april_collegedb`.`department` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hex_april_collegedb`.`student_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hex_april_collegedb`.`student_course` (
  `student_id` INT NULL,
  `course_id` INT NULL,
  `id` INT NOT NULL AUTO_INCREMENT,
  `date_of_enrollment` DATE NULL,
  `discount` DOUBLE NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_student_has_course_course1_idx` (`course_id` ASC)  ,
  INDEX `fk_student_has_course_student1_idx` (`student_id` ASC)  ,
  CONSTRAINT `fk_student_has_course_student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `hex_april_collegedb`.`student` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_course1`
    FOREIGN KEY (`course_id`)
    REFERENCES `hex_april_collegedb`.`course` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
 