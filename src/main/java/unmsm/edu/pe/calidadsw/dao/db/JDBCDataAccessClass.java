package unmsm.edu.pe.calidadsw.dao.db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antony
 */
public class JDBCDataAccessClass {
    private String jdbcURL = null;
    private String jdbcUsername = null;
    private String jdbcPassword = null;
    private static final Logger LOGGER = Logger.getLogger(JDBCDataAccessClass.class.getName());

    public JDBCDataAccessClass() {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("src/main/resources/application.properties"));

            this.jdbcURL = props.getProperty("jdbc.database.url");
            this.jdbcUsername = props.getProperty("jdbc.database.username");
            this.jdbcPassword = props.getProperty("jdbc.database.password");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    /**
     * 
     * @return
     */
    public Connection getJdbcConnection() {
        Connection jdbcConnection = null;

        try {
            jdbcConnection = DriverManager.getConnection(this.jdbcURL, this.jdbcUsername, this.jdbcPassword);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }

        return jdbcConnection;
    }
}
