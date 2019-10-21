/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package name.dougmcneil.altarchivetypes;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

public class AltArchiveDataObjectOld extends MultiDataObject {

    public AltArchiveDataObjectOld(FileObject pf, MultiFileLoader loader) throws
            DataObjectExistsException, IOException {
        super(pf, loader);

    }

    @Override
    protected Node createNodeDelegate() {
//        return new AltArchiveNode(this);
return null;
    }

    @Override
    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }
}
