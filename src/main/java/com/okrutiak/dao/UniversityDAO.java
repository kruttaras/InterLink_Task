package com.okrutiak.dao;

import com.okrutiak.institution.University;

public interface UniversityDAO {
    University getUniversityByName(String name);
}
