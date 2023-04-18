package org.fasttrackit.webappbackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.webappbackend.model.Transaction;
import org.fasttrackit.webappbackend.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transactions")
@RequiredArgsConstructor
@Slf4j
public class TransactionController {

    private final TransactionService service;

    @GetMapping() // http://localhost:1011/transactions
    public List<Transaction> getAllTransactions(){
        log.info("GET all transactions");
        return service.getAllTransactions();
    }


    @GetMapping("{id}")
    public Transaction getTransactionWithId(@PathVariable String id){
        log.info("GET transactions with id");
        return service.getTransactionWithId(id);
    }

    @PostMapping
    public Transaction addsNewTransaction(@RequestBody Transaction addTransaction){
        log.info("POST add transactions");
        return service.addsNewTransaction(addTransaction);
    }

    @PutMapping("{id}")
    public Transaction replaceTransaction(@PathVariable String id, @RequestBody Transaction replaceTransaction){
        log.info("PUT replace transaction");
        return service.replaceTransaction(id,replaceTransaction);
    }

    @DeleteMapping("{id}")
    public Transaction deletedWithId(@PathVariable String id){
        log.info("DELETE transaction with id");
        return service.deletedWithIdd(id);
    }


}
