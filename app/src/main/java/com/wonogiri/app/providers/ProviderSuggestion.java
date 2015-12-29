package com.wonogiri.app.providers;

import android.content.SearchRecentSuggestionsProvider;

public class ProviderSuggestion extends SearchRecentSuggestionsProvider {
    public final static String AUTHORITY = "ProviderSuggestion";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public ProviderSuggestion(){
        setupSuggestions(AUTHORITY, MODE);
    }

}
