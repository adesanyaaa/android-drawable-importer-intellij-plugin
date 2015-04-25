package de.mprengemann.intellij.plugin.androidicons.controllers;

import de.mprengemann.intellij.plugin.androidicons.controllers.androidicons.IAndroidIconsController;
import de.mprengemann.intellij.plugin.androidicons.controllers.filepicker.IFilePickerController;
import de.mprengemann.intellij.plugin.androidicons.controllers.iconimporter.IIconsImporterController;
import de.mprengemann.intellij.plugin.androidicons.controllers.materialicons.IMaterialIconsController;
import de.mprengemann.intellij.plugin.androidicons.controllers.settings.ISettingsController;

public interface IControllerFactory {

    IAndroidIconsController getAndroidIconsController();

    IMaterialIconsController getMaterialIconsController();

    ISettingsController getSettingsController();

    IIconsImporterController getIconImporterController();

    IFilePickerController getFilePickerController();

    void tearDown();

}
