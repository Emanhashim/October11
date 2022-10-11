package com.bazra.usermanagement.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FullTransaction")
public class FullTransaction {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 	@Column(name = "transactionId")
	    private int id;
	
	    @ManyToOne
	    @JoinColumn(name = "toAccount")
	    private Account toAccountNumber;
	    @ManyToOne
	    @JoinColumn(name = "fromAccount")
	    private Account fromAccountNumber;

	    private BigDecimal transactionAmount;
//	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private LocalDate transactionDateTime;
	    @ManyToOne
	    @JoinColumn(name = "transactionTypeID")
	    private Transactiontype transactiontype;
	
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public BigDecimal getTransactionAmount() {
			return transactionAmount;
		}
		public void setTransactionAmount(BigDecimal transactionAmount) {
			this.transactionAmount = transactionAmount;
		}
		public LocalDate getTransactionDateTime() {
			return transactionDateTime;
		}
		public void setTransactionDateTime(LocalDate transactionDateTime) {
			this.transactionDateTime = transactionDateTime;
		}
		public Account getToAccountNumber() {
			return toAccountNumber;
		}
		public void setToAccountNumber(Account toAccountNumber) {
			this.toAccountNumber = toAccountNumber;
		}
		public Account getFromAccountNumber() {
			return fromAccountNumber;
		}
		public void setFromAccountNumber(Account fromAccountNumber) {
			this.fromAccountNumber = fromAccountNumber;
		}
		public Transactiontype getTransactiontype() {
			return transactiontype;
		}
		public void setTransactiontype(Transactiontype transactiontype) {
			this.transactiontype = transactiontype;
		}
		
		
	    
	    

}
