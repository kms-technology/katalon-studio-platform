package com.katalon.platform.internal;

import com.katalon.platform.api.Application;
import com.katalon.platform.api.service.ExtensionManager;
import com.katalon.platform.api.service.FolderManager;
import com.katalon.platform.api.service.InternalActionManager;
import com.katalon.platform.api.service.PluginManager;
import com.katalon.platform.api.service.ProjectManager;
import com.katalon.platform.api.service.TestCaseManager;
import com.katalon.platform.internal.extension.ExtensionManagerImpl;

public class ApplicationImpl implements Application {
    
    private final PluginManager pluginManager = new PluginManagerImpl();
    
    private final ExtensionManager extensionManager = new ExtensionManagerImpl();
    
    private final InternalActionManager actionManager = new InternalActionManagerImpl();
    
    

    @Override
    public PluginManager getPluginManager() {
        return pluginManager;
    }

    @Override
    public ExtensionManager getExtensionManager() {
        return extensionManager;
    }

    @Override
    public InternalActionManager getActionService() {
        return actionManager;
    }
}
