package com.exLab.SpringDemoFromAnnaBot.service;

import com.exLab.SpringDemoFromAnnaBot.config.BotConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
@Component
public class TelegramBot extends TelegramLongPollingBot {
    final BotConfig config;
    private final CityService cityService;

    public TelegramBot(BotConfig config, CityService cityService) {
        this.config = config;
        this.cityService = cityService;
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    @Override
    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText() ){
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (messageText.equals("/start")) {
                startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
            } else   if (messageText.equalsIgnoreCase(cityService.getNameOfCity(messageText))){
                    sendMessage(chatId, cityService.getInfoAboutCity(messageText) );
                    } else  {
                        sendMessage(chatId, "Sorry, command was not recognized");
                        log.info("Unexpected message");
                    }
        }
    }

    private void startCommandReceived(long chatId, String name){
        String answer = "Hi, " + name + ", nice to meet you!  Enter the city:";
        sendMessage(chatId, answer);
        log.info("Replied to user " + name);
    }

    private void sendMessage(long chatId, String textToSend){
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        try{
            execute(message);
        }catch (TelegramApiException e){
            log.error("Error occurred: " + e.getMessage());
        }
    }

}
