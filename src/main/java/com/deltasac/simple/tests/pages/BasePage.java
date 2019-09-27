package com.deltasac.simple.tests.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	private WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void submit(By locator) {
		driver.findElement(locator).submit();
	}

	public void visit(String url) {
		driver.get(url);
	}
	
	public void clear(By locator) {
		findElement(locator).clear();
	}

	public Boolean containsText(String text, By locator) {
		return findElement(locator).getText().contains(text);
	}

	public void selectOptionByVisibleText(String text, By locator) {
		Select estadoSelect = new Select(findElement(locator));
		estadoSelect.selectByVisibleText(text);
	}

	public Boolean isSelected(By locator) {
		return findElement(locator).isSelected();
	}
	
	public String getTextInputDisabled(By locator) {
		return findElement(locator).getAttribute("value");
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (Exception e) {
			// Se puede manejar la exception enviando a logs o un reporte.
			return false;
		}
	}
	
	public void waitForVisibilityOfElement(By locator, Integer timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
