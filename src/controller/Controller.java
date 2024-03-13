package controller;

import service.FileService;
import service.CountService;
import view.View;

public class Controller {
    private final CountService countService;
    private final View view;

    public Controller(){
        this.countService = new CountService(new FileService().getStringWithoutFile());
        this.view = new View();
    }
    public void run(){
        view.viewCount(this.countService.getCount());
        view.viewLongWord(this.countService.getLongWord());
        view.viewCountWord(this.countService.getCountWords());
    }
}
