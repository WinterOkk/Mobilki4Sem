private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text = "App created";
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        Log.i(TAG, text);
    }
    @Override
    protected void onStart() {
        super.onStart();
        String text = "App started";
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        Log.i(TAG, text);

    }

    @Override
    protected void onRestart() {
        String text = "App restarted";
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        Log.i(TAG, text);
        super.onRestart();
    }

    @Override
    protected void onPause() {
        String text = "App paused";
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        Log.i(TAG, text);
        super.onPause();
    }

    @Override
    protected void onStop() {
        Context context = getApplicationContext();
        String text = "App stopped";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        Log.w(TAG, text);
        Log.i(TAG, text);
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        String text = "App destroyed";
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        Log.i(TAG, text);
        super.onDestroy();
    }
}
