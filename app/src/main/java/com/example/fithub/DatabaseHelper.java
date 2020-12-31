package com.example.fithub;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.Vector;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context) {
        super(context, "fithub.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createExerciseTable = "CREATE TABLE exercises(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, minute INTEGER, description TEXT, image TEXT);";
        db.execSQL(createExerciseTable);
        String createTypeTable = "CREATE TABLE types(id INTEGER PRIMARY KEY AUTOINCREMENT, ex_id INTEGER, name TEXT, description TEXT, reps INTEGER, image TEXT, FOREIGN KEY(ex_id) REFERENCES exercises(id))";
        db.execSQL(createTypeTable);
        String insertExerciseTable = "INSERT INTO exercises(name, minute, description, image)" + "VALUES ('Full Body', '10', 'Full body workout'," + R.drawable.thumb4 + ")," + "('Lower Body', '12', 'Lower body workout'," + R.drawable.thumb3 +")," + "('Arm', '15', 'Arm workout'," + R.drawable.thumb2 + ")," + "" + "('Chest', '15', 'Chest workout'," + R.drawable.thumb1 +")";
        db.execSQL(insertExerciseTable);
        String insertTypeTable = "INSERT INTO types(ex_id, name, description, reps, image) " +
                "VALUES ('1','Jumping Jacks','A physical jumping exercise performed by jumping to a position with the legs spread wide and the hands going overhead, sometimes in a clap, and then returning to a position with the feet together and the arms at the sides.', '30', "+ R.drawable.thumb4 + "), " +
                "('1','Incline Push-ups', 'An incline pushup is an elevated form of a traditional pushup. Your upper body is elevated with an exercise box or other piece of equipment.', '16', "+ R.drawable.thumb4 + "), " +
                "('1','Knee Push-ups', 'Start at the top of the push up position with your hands on the floor, arms straight and underneath your shoulders. Step your knees back behind you so that there is a straight line through your body from your knees up to your head. Engage your glutes, tense your legs and brace your core to keep your body rigid.', '10', "+ R.drawable.thumb4 + "), " +
                "('1', 'Push-ups', 'Placing your arms shoulder-width apart and palms firmly rooted to the ground, bend your arms, lowering your chest to the floor while keeping your body straight. Once your chest is close enough to touch the floor, push yourself back up to the start position. Additionally, ensure that your elbows are at a 45° angle from your body, and that your arms are bent at a 90° angle when lowering your body.', '8', "+ R.drawable.thumb4 + "), " +
                "('1', 'Cobra Stretch', 'Retain your legs straight and press your palms firmly against the floor. Inhale and straighten your arms and lift your chest following your upper back. Keep your hips steady and remain in this position for 20 to 30 seconds.', '1', "+ R.drawable.thumb4 + "), "+
                "('2', 'Air Squats', 'Keep your feet at shoulder width apart and pointed straight ahead. When squatting, your hips will move down and back. Your lumbar curve should be maintained, and your heels should stay flat on the floor the entire time. In air squats, your hips will descend lower than your knees.', '30', "+ R.drawable.thumb3 + "), " +
                "('2', 'Jumping Jacks','A physical jumping exercise performed by jumping to a position with the legs spread wide and the hands going overhead, sometimes in a clap, and then returning to a position with the feet together and the arms at the sides.', '30', "+ R.drawable.thumb3 + ")," +
                "('2', 'Lunge Kicks', 'Stand straight, face front, keep your core tight and your back flat. As you lunge, keep the front knee aligned with the ankle and keep your weight loaded in the front heel. Exhale as you kick, and then return to the starting position or go directly into a new lunge.', '16', "+ R.drawable.thumb3 + ")," +
                "('2', 'Step-ups', 'Stand straight, face front, keep your core tight and your back flat. As you lunge, keep the front knee aligned with the ankle and keep your weight loaded in the front heel. Exhale as you kick, and then return to the starting position or go directly into a new lunge.', '25', "+ R.drawable.thumb3 + ")," +
                "('2', 'Side Leg Lift', 'Stand upright with your toes facing forward. As you lift your right leg up off the floor with the foot flexed, inhale and shift the weight into your left foot. As you exhale, bring the leg back down to meet the left. Repeat 10-12 times, then switch to the other side.', '24', "+ R.drawable.thumb3 + ")," +
                "('3', 'Side Plank', 'Lie on your right side with your right hand directly underneath your right shoulder. Extend your legs and stack your left foot on top of your right, and then squeeze your abs and glutes to lift your hips off the floor. Extend your left hand straight up toward the ceiling. Hold here for a set amount of time.', '1', "+ R.drawable.thumb2 + ")," +
                "('3', 'Push-ups', 'Placing your arms shoulder-width apart and palms firmly rooted to the ground, bend your arms, lowering your chest to the floor while keeping your body straight. Once your chest is close enough to touch the floor, push yourself back up to the start position. Additionally, ensure that your elbows are at a 45° angle from your body, and that your arms are bent at a 90° angle when lowering your body.', '8', "+ R.drawable.thumb2 + "), " +
                "('3', 'Bicep Curl', 'Start standing with a dumbbell in each hand. Your elbows should rest at your sides and your forearms should extend out in front of your body. Your knees should stay slightly bent and your belly button should draw into the spine. Bring the dumbbells all the way up to your shoulders by bending your elbows. Once at the top, hold for a second by squeezing the muscle. Reverse the curl slowly and repeat.', '20', "+ R.drawable.thumb2 + "), " +
                "('3', 'Dips', 'Sit on a chair or bench with hands just outside of the hips and the knees bent or the legs extended straight out (harder). Lift up onto the hands and, keeping the hips very close to the chair or bench, bend the elbows, lowering down until they are at about 90 degrees. Keep the elbows pointing behind you, the shoulders down and the abs engaged. Push back to start and repeat.', '16', "+ R.drawable.thumb2 + "), " +
                "('3', 'Superman', 'Lie on your stomach with your arms and legs extended. Engage your glutes and shoulders as you simultaneously lift your arms, chest, and legs off of the floor. Hold this upward position for 3 seconds. You’ll look like superman or superwoman flying through the air. Slowly come back down to starting position.', '16', "+ R.drawable.thumb2 + "), " +
                "('4', 'Push-ups', 'Placing your arms shoulder-width apart and palms firmly rooted to the ground, bend your arms, lowering your chest to the floor while keeping your body straight. Once your chest is close enough to touch the floor, push yourself back up to the start position. Additionally, ensure that your elbows are at a 45° angle from your body, and that your arms are bent at a 90° angle when lowering your body.', '12', "+ R.drawable.thumb1 + "), " +
                "('4','Incline Push-ups', 'An incline pushup is an elevated form of a traditional pushup. Your upper body is elevated with an exercise box or other piece of equipment.', '12', "+ R.drawable.thumb1 + "), " +
                "('4', 'Mountain Climber Pushup', 'Start in a high plank. Perform one pushup. Then, pull right knee toward chest, return to start, and quickly do the same with the left to perform a mountain climber. Continue alternating for a count of four total.', '12', "+ R.drawable.thumb1 + "), " +
                "('4', 'Pull Up', 'Grab the bar with an overhand grip. Hanging from the bar, pull your shoulder blades back and down to lift your body up and build momentum. Finish by pulling up with your arms.', '10', "+ R.drawable.thumb1 + "), " +
                "('4', 'Burpee', 'From a standing position, squat, place you hands on the ground, and “jump” your feet out into a pushup position. Perform a pushup, and then jump your feet to your hands. Then jump as high as you can, throwing your hands over your head.', '14', "+ R.drawable.thumb1 + ")";
        db.execSQL(insertTypeTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//        String query = "SELECT exercises.name, exercises.minute, types.name, types.description, types.reps FROM types WHERE exercises.id = types.ex_id";
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS exercises");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS types");
    }

    public Vector<Type> getTypeList(int id){
        Vector<Type> typeList = new Vector<>();
        String query = "SELECT * FROM types WHERE ex_id =" + id;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        if(cursor.moveToFirst()){
            do{
                String typeName = cursor.getString(2);
                String typeDesc = cursor.getString(3);
                int typeReps = cursor.getInt(4);
                int typeImage = cursor.getInt(5);
                typeList.add(new Type(typeName, typeDesc, typeReps, typeImage));
            }while(cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return typeList;
    }

    public Vector<Exercise> getExerciseList(){
        Vector<Exercise> exerciseList = new Vector<>();

        String query = "SELECT * FROM exercises";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor =  db.rawQuery(query, null);
        String prevName ="";
        if(cursor.moveToFirst()){
            do{
                int ex_id = cursor.getInt(0);
                String exName = cursor.getString(1);
                int exMinute = cursor.getInt(2);
                String exDescription = cursor.getString(3);
                int exImage = cursor.getInt(4);
                exerciseList.add(new Exercise(ex_id, exName, exMinute, exDescription, getTypeList(ex_id), exImage));
            }while(cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return exerciseList;
    }

//    public Vector<Exercise> getExerciseList(){
//        Vector<Exercise> exerciseList = new Vector<>();
//
//        String query = "SELECT exercises.name, exercises.minute, types.name, types.description, types.reps FROM types types INNER JOIN exercises ON exercises.id = types.ex_id";
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor =  db.rawQuery(query, null);
//        String prevName ="";
//        if(cursor.moveToFirst()){
//            do{
//                String exName = cursor.getString(0);
//                int exMinute = cursor.getInt(1);
//                String typeName = cursor.getString(2);
//                String typeDesc = cursor.getString(3);
//                int typeReps = cursor.getInt(4);
//                exerciseList.add(new Exercise(exName, exMinute, new Type(typeName, typeDesc, typeReps)));
//            }while(cursor.moveToNext());
//
//        }
//
//        cursor.close();
//        db.close();
//        return exerciseList;
//    }
}
