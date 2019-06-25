@Override
public void onClick(View v) {
   switch (v.getId()){
       case R.id.btn_move_activity:
            Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
            startActivity(moveIntent);
            break;
   }
}
