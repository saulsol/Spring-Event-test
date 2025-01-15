package com.example.springeventtest.handler;

import com.example.springeventtest.event.PatientSaveEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class PatientHandler {

    @Async
    @TransactionalEventListener(
            classes = PatientSaveEvent.class,
            phase = TransactionPhase.AFTER_COMMIT
    )
    public void handelPatientEventAfterTransaction(PatientSaveEvent event){
        System.out.println("핸들러 처리 : "+event.getMessage());
    }


    @Async
    @TransactionalEventListener(
            classes = PatientSaveEvent.class,
            phase = TransactionPhase.BEFORE_COMMIT
    )
    public void handelPatientEventBeforeTransaction(PatientSaveEvent event){
        System.out.println("핸들러 처리 전 메세지");
    }


    @Async
    @TransactionalEventListener(
            classes = PatientSaveEvent.class,
            phase = TransactionPhase.AFTER_ROLLBACK
    )
    public void handelPatientEventTransactionRollback(PatientSaveEvent event){
        System.out.println("트랜잭션이 롤백되었습니다");
    }


}
