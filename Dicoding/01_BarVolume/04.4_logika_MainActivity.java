@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    ...
    
    btnCalculate.setOnClickListener(this);
}
 
@Override
public void onClick(View v) {
    if (v.getId() == R.id.btn_calculate) {
        String inputLength = edtLength.getText().toString().trim();
        String inputWidth = edtWidth.getText().toString().trim();
        String inputHeight = edtHeight.getText().toString().trim();
        boolean isEmptyFields = false;
        boolean isInvalidDouble = false;
        if (TextUtils.isEmpty(inputLength)) {
            isEmptyFields = true;
            edtLength.setError("Field ini tidak boleh kosong");
        }
        if (TextUtils.isEmpty(inputWidth)) {
            isEmptyFields = true;
            edtWidth.setError("Field ini tidak boleh kosong");
        }
        if (TextUtils.isEmpty(inputHeight)) {
            isEmptyFields = true;
            edtHeight.setError("Field ini tidak boleh kosong");
        }
        Double length = toDouble(inputLength);
        Double width = toDouble(inputWidth);
        Double height = toDouble(inputHeight);
        if (length == null) {
            isInvalidDouble = true;
            edtLength.setError("Field ini harus berupa nomer yang valid");
        }
        if (width == null) {
            isInvalidDouble = true;
            edtWidth.setError("Field ini harus berupa nomer yang valid");
        }
        if (height == null) {
            isInvalidDouble = true;
            edtHeight.setError("Field ini harus berupa nomer yang valid");
        }
        if (!isEmptyFields && !isInvalidDouble) {
            double volume = length * width * height;
            tvResult.setText(String.valueOf(volume));
        }
    }
}
