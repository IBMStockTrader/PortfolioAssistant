package com.kyndryl.cjot.stocktrader.clients.tradehistory;

public record Transaction(
        String owner,
        Integer shares,
        String symbol,
        Float notional,
        Float price,
        String commission,
        String _id,
        String id,
        String when
) {
}
