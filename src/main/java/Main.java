package main.java;

import main.java.model.MumModel;

/**
 * Created by JammersBlah on 25/05/2017.
 */
public class Main {
    public static void main(String args[]) throws Exception
    {
        MumView theView = new MumView();

        MumModel theModel = new MumModel();

        MumController theController = new MumController(theView, theModel);

        theView.setVisible(true);

    }
}
