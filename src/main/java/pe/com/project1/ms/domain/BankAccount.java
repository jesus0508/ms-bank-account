package pe.com.project1.ms.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
	private String id;
	private String bankAccountNumber;
	private BigDecimal balance;
	private BankAccountState bankAccountState;
	private String accountHolderId;
	private BankingTransactionHistory bankingTransactionHistory;
}
