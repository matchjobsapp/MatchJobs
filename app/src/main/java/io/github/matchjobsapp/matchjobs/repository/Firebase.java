package io.github.matchjobsapp.matchjobs.repository;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * ╭────────────────────────────────────────────────────╮
 * │                                                    │
 * │   @author: Ivam H. M. Santos                       │
 * │   https://www.linkedin.com/in/ivamsantos           |
 * |   ivamks@gmail.com                                 |
 * |   Project: MatchJobs                         |
 * |   Create at 27/10/18                                │
 * │                                                    │
 * ╰────────────────────────────────────────────────────╯
 */
public class Firebase {

    private static FirebaseDatabase database;

    public Firebase() {
        database = FirebaseDatabase.getInstance();
    }

    public static FirebaseDatabase getDatabase() {
        if(database == null)
            database = FirebaseDatabase.getInstance();
        return database;
    }

}
