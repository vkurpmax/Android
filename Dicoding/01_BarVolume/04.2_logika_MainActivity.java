@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
 
    edtWidth = findViewById(R.id.edt_width);
    edtHeight = findViewById(R.id.edt_height);
    edtLength = findViewById(R.id.edt_length);
    btnCalculate = findViewById(R.id.btn_calculate);
    tvResult = findViewById(R.id.tv_result);
 
}
