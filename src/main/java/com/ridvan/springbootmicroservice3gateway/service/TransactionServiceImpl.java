package com.ridvan.springbootmicroservice3gateway.service;

import com.google.gson.JsonElement;
import com.ridvan.springbootmicroservice3gateway.request.ITransactionServiceRequest;
import com.ridvan.springbootmicroservice3gateway.util.RetrofitUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements ITransactionService {

    @Autowired
    private ITransactionServiceRequest transactionServiceRequest;

    @Override
    public JsonElement saveTransaction(JsonElement requestBody) {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.saveTransaction(requestBody));
    }

    @Override
    public void deleteTransaction(Long transactionId) {
        RetrofitUtils.executeInBlock(transactionServiceRequest.deleteTransaction(transactionId));
    }

    @Override
    public List<JsonElement> getAllTransactionsOfAuthorizedUser(Long userId) {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.getAllTransactionsOfAuthorizedUser(userId));
    }
}
