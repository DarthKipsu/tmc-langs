package fi.helsinki.cs.tmc.langs.io;

import java.nio.file.Path;

/**
 * Specifies which files are student files.
 *
 * <p>Student files are any files that are excepted to be modified and/or created by the student.
 * That is, any files that should not be overwritten when when updating an already downloaded
 * exercise and any files that should be submitted to the server.
 */
public interface StudentFilePolicy {

    /**
     * Answers whether the file in <tt>path</tt> is an student file.
     */
    boolean isStudentFile(Path path, Path projectRootPath);
}
