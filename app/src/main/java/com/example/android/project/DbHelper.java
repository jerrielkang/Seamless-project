package com.example.android.project;

import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.AdapterView;
import android.widget.RadioButton;

public class DbHelper extends SQLiteOpenHelper {

    List<Question> quesList;

    Question currentQ;
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "Seamless";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_HINT= "hint";
    private SQLiteDatabase dbase;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT,"+KEY_HINT +" TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }

    private void addQuestions()
    {
        Question q1 = new Question("1) x - x + 2 = ?", "2", "2x", "0", "2", "group the x together");
        this.addQuestion(q1);


        Question q2 = new Question("2) y + 3 - 2y = ?", "3-2y", "3+y", "3-y", "3-y", "group the y together");
        this.addQuestion(q2);

        Question q3 = new Question("3) y + x + 2x = ?", "5xy", "3x + y", "2x +xy", "3x + y", "find the two similar terms");
        this.addQuestion(q3);
        Question q4 = new Question("4) 5xy + x + y + 3xy = ?", "8xy + x + y", "10xy", "5xx + 3xyy", "8xy + x + y", "NOTE: XY is not the same as x or y");
        this.addQuestion(q4);
        Question q5 = new Question("5) 13x + 7y − 2x + 6a", "10xya", "15x + 7y + 6a", "6a + 11x + 7y", "6a + 11x + 7y", "");
        this.addQuestion(q5);
        Question q6 = new Question("6) 3a + 4a - 3 = ?", "7a -3", "10a", "10", "7a -3", "Group the similar terms together");
        this.addQuestion(q6);
        Question q7 = new Question("7) 3xy + 6xy + 3yz - 2yz - xy = ?", "8xy + yz", "10xy +yz", "12xy - 3yz", "8xy + yz", "group the 2 different terms");
        this.addQuestion(q7);
        Question q8 = new Question("8) −5[−2(m − 3n) + 4n]", "20m- 40n", "10n- 20m", "10m − 50n", "10m − 50n", "Use BODMAS method");
        this.addQuestion(q8);
        Question q9 = new Question("9) −[7(a − 2b) − 4b] = ?", "−7a + 18b", "7a + 18b", "7a - 18b ", "−7a + 18b","USE BODMAS method");
        this.addQuestion(q9);
        Question q10 = new Question("10) (xy - x) - (x - xy) = ?", "3xy - 1x", "2xy - 2x", "4xy", "2xy - 2x", "BODMAS method");
        this.addQuestion(q10);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }
    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_HINT, quest.getHINT());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setHINT(cursor.getString(6));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }
    public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
}