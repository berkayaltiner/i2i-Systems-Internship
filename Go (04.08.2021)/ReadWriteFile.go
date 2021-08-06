package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func readFile() ([]string, bool) {
	var fileContext []string
	fileToRead, err := os.Open("Numbers.txt")

	if err != nil {
		return nil, false
	}

	defer fileToRead.Close()

	scanner := bufio.NewScanner(fileToRead)

	for scanner.Scan() {

		fileContext = append(fileContext, scanner.Text())
	}

	if err := scanner.Err(); err != nil {
		return nil, false
	}

	return fileContext, true
}

func writeFile(average int, result string) bool {

	switch result {
	case "Average":
		result = "rowAverage.txt"
	case "TotalAverage":
		result = "totalAverage.txt"

	default:
		fmt.Printf("Please enter an valid operation")
	}

	createdFile, err := os.OpenFile(result,
		os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0644)
	if err != nil {
		return false
	}
	defer createdFile.Close()
	_, err = createdFile.WriteString(fmt.Sprintf("%d\n", average))
	if err != nil {
		fmt.Printf("Err :%v", err)
	}
	return true
}

func main() {
	rows, result := readFile()
	var num = 0
	if !result {
		fmt.Println("Err !")
	} else {
		var sum int
		var total int
		for i := 0; i < len(rows); i++ {
			text := strings.Fields(rows[i])
			for j := 0; j < len(text)-1; j++ {
				num, err := strconv.Atoi(text[j])
				if err != nil {
					fmt.Println("Err")
				}
				sum += num

			}
			avg := sum / 24
			fmt.Printf("%d. row average %d\n", i+1, avg)
			total += sum
			sum = 0
			writeFile(avg, "Average")
		}
		totalAvg := total / len(rows)
		fmt.Printf("\nTotal Average %d", totalAvg)
		writeFile(totalAvg, "TotalAverage")
	}
	fmt.Print(num)
}
