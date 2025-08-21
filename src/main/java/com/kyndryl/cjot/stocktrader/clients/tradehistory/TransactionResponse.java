package com.kyndryl.cjot.stocktrader.clients.tradehistory;

import java.util.List;

public record TransactionResponse(List<Transaction> transactions) {
}
