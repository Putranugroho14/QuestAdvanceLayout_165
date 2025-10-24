import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAligment = Aligment.CenterHorizontally
    ){
        Text(
            text = stringResource(id = R.string.prodi),
            fontsize = 35.sp,
            fontWeight = fontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontsize = 22.sp,
        )
        Spacer(modifier = Modifier.height(height = 25.dp))

    }
}
