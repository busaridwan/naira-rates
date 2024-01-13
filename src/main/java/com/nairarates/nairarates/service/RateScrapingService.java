package com.nairarates.nairarates.service;

import com.nairarates.nairarates.repository.RateRepository;
import com.nairarates.nairarates.entity.Rate;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service

@RequiredArgsConstructor
public class RateScrapingService {
    private final RateRepository rateRepository;
    // Inject scraping tools like Tweepy or Beautiful Soup

    // Implement scraping logic (extract rate from Twitter)
    public Double scrapeCurrentRate() {
        // ...
        return null;
    }

    @Transactional
    @Scheduled(cron = "0 0 12 * * ?") // Schedule daily at noon
    public void saveRate() {
        Double rate = scrapeCurrentRate();
        Rate rateEntity = new Rate();
        rateEntity.setNairaToDollarRate(rate);
        rateEntity.setDate(LocalDate.now());
        rateRepository.save(rateEntity);
    }
}

