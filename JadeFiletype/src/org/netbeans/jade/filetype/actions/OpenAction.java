/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.jade.filetype.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;

public final class OpenAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
     FileChooserBuilder fcb = new FileChooserBuilder(org.netbeans.jade.filetype.actions.OpenAction.class);
        fcb.setApproveText("Open");
        fcb.setFileFilter(new JadeFileFilter());

        JFileChooser jfc = fcb.createFileChooser();

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = jfc.getSelectedFile();
                FileObject foSelectedFile = FileUtil.toFileObject(file);

                DataObject obj = DataObject.find(foSelectedFile);
                EditorCookie ec = obj.getLookup().lookup(EditorCookie.class);

                if (ec != null) {
                    ec.open();
                }

            } catch (DataObjectNotFoundException donfe) {
            }
        }
    }

    private final class JadeFileFilter extends FileFilter{

        @Override
        public boolean accept(File pathname) {

            if (pathname.isDirectory()){
                return true;
            }

            String[] path  = pathname.getPath().split("\\.");
            if (path[path.length - 1].equalsIgnoreCase("jade")){
                return true;
            }

            return false;
        }

        @Override
        public String getDescription() {
            return "Jade files";
        }

    }
}
