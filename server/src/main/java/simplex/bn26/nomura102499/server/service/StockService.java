package simplex.bn26.nomura102499.server.service;

import org.springframework.stereotype.Service;
import simplex.bn26.nomura102499.server.models.Stock;
import simplex.bn26.nomura102499.server.repository.StockRepository;

import java.util.List;

@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> listAll() {
        //try {
            return stockRepository.selectAll();
        //} catch ()
        //todo trycatch後で書く
    }
}
