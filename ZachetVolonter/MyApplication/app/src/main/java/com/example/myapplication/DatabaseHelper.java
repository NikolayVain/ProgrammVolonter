import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "employees.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE employees (_id INTEGER PRIMARY KEY AUTOINCREMENT, employeeId TEXT, name TEXT, department TEXT)");
        insertSampleData(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS employees");
        onCreate(db);
    }

    private void insertSampleData(SQLiteDatabase db) {
        // Вставьте здесь свои примеры данных в таблицу employees
        db.execSQL("INSERT INTO employees (employeeId, name, department) VALUES ('12345678', 'John Doe', 'IT')");
        db.execSQL("INSERT INTO employees (employeeId, name, department) VALUES ('8', 'Jane Smith', 'HR')");
    }

    public void updateEmployee(String employeeId, String name, String department) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("department", department);
        db.update("employees", values, "employeeId = ?", new String[]{employeeId});
    }
}


