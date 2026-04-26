package simplex.bn26.nomura102499.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simplex.bn26.nomura102499.server.models.Stock;
import simplex.bn26.nomura102499.server.service.StockService;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService){
        this.stockService = stockService;
    }

    @GetMapping
    public List<Stock> listAll() {
        return stockService.listAll();
    }
}
