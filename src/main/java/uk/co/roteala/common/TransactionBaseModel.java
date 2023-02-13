package uk.co.roteala.common;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TransactionBaseModel extends BaseEmptyModel {
    private String hash;
    private String blockHash;
    private Integer blockNumber;
    private Integer transactionIndex;
    private String from;
    private String to;
    private BigDecimal amount;
    private String timeStamp;
    private TransactionStatus status;
    private TransactionType type;
    private SignatureModel signature;
}
