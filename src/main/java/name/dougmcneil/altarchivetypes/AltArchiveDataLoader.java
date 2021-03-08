package name.dougmcneil.altarchivetypes;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.ExtensionList;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.UniFileLoader;
import org.openide.util.NbBundle;

/**
 *
 * @author doug
 */
public class AltArchiveDataLoader extends UniFileLoader {
    static final String ALTARCHIVE_MIME_TYPE = "application/x-alt-archive";   //NOI18N

    private static final long serialVersionUID = 1L;

    public AltArchiveDataLoader() {
        super("name.dougmcneil.altarchivetypes.AltArchiveDataObject"); // NOI18N
    }

    @Override
    @NbBundle.Messages("LBL_AltArchive_loader_name=AltArchive Files")
    protected String defaultDisplayName() {
        return Bundle.LBL_AltArchive_loader_name();
    }

    @Override
    protected void initialize() {
        super.initialize();
        ExtensionList extensions = new ExtensionList();
        extensions.addMimeType(ALTARCHIVE_MIME_TYPE);
        setExtensions(extensions);
    }

    @Override
    protected String actionsContext() {
       return "Loaders/application/x-alt-archive/Actions/"; // NOI18N
    }

    @Override
    protected MultiDataObject createMultiObject(FileObject primaryFile) throws DataObjectExistsException, IOException {
        return new AltArchivesDataObject(primaryFile, this);
    }
}
