package com.example.prak4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak4.ui.theme.PrimaryBackground
import com.example.prak4.ui.theme.MenuCardBg
import com.example.prak4.ui.theme.IconCircleBg
import com.example.prak4.ui.theme.TextPrimary
import com.example.prak4.ui.theme.TextSecondary
import com.example.prak4.ui.theme.ArrowIconTint
import com.example.prak4.ui.theme.CopyrightText
import com.example.prak4.ui.theme.SocialIconBg


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .padding(top = 48.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.fp),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.White)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialMediaIcon(iconResId = R.drawable.facebook)
            Spacer(modifier = Modifier.width(8.dp))
            SocialMediaIcon(iconResId = R.drawable.google)
            Spacer(modifier = Modifier.width(8.dp))
            SocialMediaIcon(iconResId = R.drawable.x)
            Spacer(modifier = Modifier.width(8.dp))
            SocialMediaIcon(iconResId = R.drawable.link)
        }
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = stringResource(id = R.string.user_name),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )
        Text(
            text = stringResource(id = R.string.user_handle),
            fontSize = 16.sp,
            color = TextSecondary
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.user_job_title),
            fontSize = 14.sp,
            color = TextSecondary,
            modifier = Modifier.padding(horizontal = 32.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))

        MenuItemCard(
            iconResId = R.drawable.privacy,
            text = stringResource(id = R.string.menu_privacy)
        )
        Spacer(modifier = Modifier.height(12.dp))
        MenuItemCard(
            iconResId = R.drawable.transaction,
            text = stringResource(id = R.string.menu_transaction)
        )
        Spacer(modifier = Modifier.height(12.dp))
        MenuItemCard(
            iconResId = R.drawable.settings,
            text = stringResource(id = R.string.menu_settings)
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.copyright_profile),
            fontSize = 14.sp,
            color = CopyrightText,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}

@Composable
fun SocialMediaIcon(iconResId: Int) {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(SocialIconBg),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun MenuItemCard(@androidx.annotation.DrawableRes iconResId: Int, text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(60.dp),
        colors = CardDefaults.cardColors(containerColor = MenuCardBg),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(IconCircleBg),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = iconResId),
                        contentDescription = null,
                        tint = TextPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = text,
                    fontSize = 18.sp,
                    color = TextPrimary
                )
            }

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                contentDescription = "Next",
                tint = ArrowIconTint,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}