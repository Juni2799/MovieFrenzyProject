package dev.akshaan.MovieFrenzy.service;

import dev.akshaan.MovieFrenzy.model.ShowSeat;
import dev.akshaan.MovieFrenzy.model.Ticket;
import dev.akshaan.MovieFrenzy.model.constant.ShowSeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private ShowSeatService showSeatService;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception {

        for(int showSeatId : showSeatIds){
            ShowSeat showSeat = showSeatService.getShowSeat(showSeatId);
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new Exception("Seat is not available anymore");
            }
        }

        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }

        makePayment();
        return new Ticket();
    }

    public boolean makePayment(){
        return true;
    }

    public String greet(){
        return "HELLO WORLD!";
    }
}
