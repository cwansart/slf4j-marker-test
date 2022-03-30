package de.cwansart.markertest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private static final String MARKER_FATAL = "FATAL";

    private static final String MARKER_HIDDEN = "HIDDEN";

    public static void main(String[] args) {
        Marker fatalMarker = MarkerFactory.getMarker(MARKER_FATAL);
        Marker hiddenMarker = MarkerFactory.getMarker(MARKER_HIDDEN);

        LOGGER.error("#1 before");
        LOGGER.error(fatalMarker, "#2 THIS IS A FATAL ERROR");
        LOGGER.error(hiddenMarker, "#3 hidden");
        LOGGER.error("#4 after");
    }
}
