package io.github.matchjobsapp.matchjobs.repository;

import com.google.firebase.database.DatabaseReference;

/**
 * ╭────────────────────────────────────────────────────╮
 * │                                                    │
 * │   @author: Ivam H. M. Santos                       │
 * │   https://www.linkedin.com/in/ivamsantos           |
 * |   ivamks@gmail.com                                 |
 * |   Project: MatchJobs                               |
 * |   Create at 27/10/18                               │
 * │                                                    │
 * ╰────────────────────────────────────────────────────╯
 */
public class ProfissionalDAO {

    private static DatabaseReference dao;

    public ProfissionalDAO() {
        dao = Firebase.getDatabase().getReference("profissional");
    }


}
