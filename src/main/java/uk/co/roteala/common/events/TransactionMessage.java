package uk.co.roteala.common.events;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import reactor.netty.Connection;
import uk.co.roteala.common.AccountModel;
import uk.co.roteala.common.BaseModel;

@Data
@RequiredArgsConstructor
public class TransactionMessage extends BaseModel implements Message {
    private Connection connection;

    private MessageActions messageAction;

    private final BaseModel message;

    private boolean verified;

    private String address;
    @Override
    public MessageTypes getMessageType() {
        return MessageTypes.TRANSACTION;
    }
}
