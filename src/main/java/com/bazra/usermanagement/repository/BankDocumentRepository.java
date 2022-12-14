package com.bazra.usermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bazra.usermanagement.model.Bank_Document;
@Repository
@Transactional(readOnly = true)
public interface BankDocumentRepository extends JpaRepository<Bank_Document, Integer> {
	Optional<Bank_Document> findByDocument(String name);
	Optional<Bank_Document> findById(Integer id);
}
