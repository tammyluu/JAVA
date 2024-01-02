package com.laptrinhjavaweb.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class MySiteMeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*", "web.jsp");
        builder.addDecoratorPath("/admin*", "admin.jsp");

        /*exclude path*/
        builder.addExcludedPath("/login*");
    }
}
