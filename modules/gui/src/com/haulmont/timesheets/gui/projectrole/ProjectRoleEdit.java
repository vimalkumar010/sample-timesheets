/*
 * Copyright (c) 2015 com.haulmont.ts.gui.projectrole
 */
package com.haulmont.timesheets.gui.projectrole;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.timesheets.entity.ProjectRole;
import com.haulmont.timesheets.gui.ComponentsHelper;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author gorelov
 */
public class ProjectRoleEdit extends AbstractEditor<ProjectRole> {

    @Inject
    protected FieldGroup fieldGroup;

    @Override
    public void init(Map<String, Object> params) {
        fieldGroup.addCustomField("description", ComponentsHelper.getCustomTextArea());
    }
}