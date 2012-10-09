/*
 *    uDig - User Friendly Desktop Internet GIS client
 *    http://udig.refractions.net
 *    (C) 2012, Refractions Research Inc.
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package net.refractions.udig.catalog.service.database;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "net.refractions.udig.catalog.service.database.messages"; //$NON-NLS-1$
    public static String DatabaseWizardLocalization_brokenElements;
    public static String DatabaseWizardLocalization_changePasswordQuery;
    public static String DatabaseWizardLocalization_confirmRemoveConnection;
    public static String DatabaseWizardLocalization_database;
    public static String DatabaseWizardLocalization_databaseConnectionInterrupted;
    public static String DatabaseWizardLocalization_databasePermissionProblemMessage;
    public static String DatabaseWizardLocalization_filter;
    public static String DatabaseWizardLocalization_geometryType;
    public static String DatabaseWizardLocalization_geometryName;
    public static String DatabaseWizardLocalization_host;
    public static String DatabaseWizardLocalization_incorrectConfiguration;
    public static String DatabaseWizardLocalization_list;
    public static String DatabaseWizardLocalization_password;
    public static String DatabaseWizardLocalization_port;
    public static String DatabaseWizardLocalization_portError;
    public static String DatabaseWizardLocalization_previousConnections;
    public static String DatabaseWizardLocalization_publicSchema;
    public static String DatabaseWizardLocalization_publicSchemaTooltip;
    public static String DatabaseWizardLocalization_removeConnection;
    public static String DatabaseWizardLocalization_requiredField;
    public static String DatabaseWizardLocalization_schema;
    public static String DatabaseWizardLocalization_storePassword;
    public static String DatabaseWizardLocalization_table;
    public static String DatabaseWizardLocalization_tableSelectionFilterTooltip;
    public static String DatabaseWizardLocalization_unexpectedError;
    public static String DatabaseWizardLocalization_username;
	public static String DatabaseWizardLocalization_optionalParams;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }
    private Messages() {
    }
}
