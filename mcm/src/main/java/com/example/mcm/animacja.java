package com.example.mcm;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class animacja {
    public static void animateLabelBackgroundColor(Label label, Color startColor, Color endColor, double durationSeconds) {
        label.setOnMouseEntered((MouseEvent e) -> {
            createAndPlayAnimation(label, startColor, endColor, durationSeconds);
        });
        label.setOnMouseExited(e -> {
            createAndPlayAnimation(label, endColor, startColor, durationSeconds);
        });
    }

    private static void createAndPlayAnimation(Label label, Color fromColor, Color toColor, double durationSeconds) {
        Animation animation = new Transition() {
            {
                setCycleDuration(Duration.seconds(durationSeconds));
            }
            @Override
            protected void interpolate(double frac) {
                Color interpolatedColor = fromColor.interpolate(toColor, frac);
                String style = String.format("-fx-padding: 10; -fx-background-radius: 14; -fx-background-color: #%02x%02x%02x;",
                        (int)(interpolatedColor.getRed() * 255),
                        (int)(interpolatedColor.getGreen() * 255),
                        (int)(interpolatedColor.getBlue() * 255));
                label.setStyle(style);
            }
        };
        animation.play();
    }
}

