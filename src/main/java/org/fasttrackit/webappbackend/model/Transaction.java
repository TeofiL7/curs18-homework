package org.fasttrackit.webappbackend.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Transaction {
    private String id;
    private String product;
    private TransactionType type;
    private double amount;

}
