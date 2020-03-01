package com.highsight.highsightbackend.repo;

import com.highsight.highsightbackend.repo.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class PagesRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_PAGE_BY_URL_SQL = "select * from pages";

    public List<Page> getPageByURL() {
        List<Page> pages = new ArrayList<Page>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(GET_PAGE_BY_URL_SQL);

        for (Map<String, Object> row : rows)
        {
            int id = (int)row.get("id");
            String url = (String) row.get("url");
            String overallScore = (String) row.get("overallScore");

            Page page = new Page(id, url, overallScore);

            pages.add(page);
        }
        return pages;
    }
}
