package com.tsswebapps.tssmsemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsswebapps.tssmsemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
