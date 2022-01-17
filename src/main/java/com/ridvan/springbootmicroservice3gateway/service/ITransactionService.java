package com.ridvan.springbootmicroservice3gateway.service;

import com.google.gson.JsonElement;

import java.util.List;

public interface ITransactionService {
    JsonElement saveTransaction(JsonElement requestBody);

    void deleteTransaction(Long transactionId);

    List<JsonElement> getAllTransactionsOfAuthorizedUser(Long userId);
}
