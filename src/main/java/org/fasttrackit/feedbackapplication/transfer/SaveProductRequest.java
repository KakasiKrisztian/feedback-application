package org.fasttrackit.feedbackapplication.transfer;

import javax.validation.constraints.NotNull;

public class SaveProductRequest {
    @NotNull
    private String name;
    @NotNull
    private Integer rating;
    private String ratingDescription;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }

    @Override
    public String toString() {
        return "SaveProductRequest{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", ratingDescription='" + ratingDescription + '\'' +
                '}';
    }
}
