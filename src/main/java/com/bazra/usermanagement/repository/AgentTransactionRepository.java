package com.bazra.usermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bazra.usermanagement.model.AgentTransaction;

public interface AgentTransactionRepository extends JpaRepository<AgentTransaction, Long> {
	List<AgentTransaction> findByagentAccount(String agent);

}
